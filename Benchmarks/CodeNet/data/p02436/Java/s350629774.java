

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static int MIN_VALUE = -1000000000;
  public static int MAX_VALUE =  1000000000;

  public static int MIN_COMMAND = 1;
  public static int MAX_COMMAND = 200000;

  public static int MIN_QUEUE_NUM = 1;
  public static int MAX_QUEUE_NUM = 1000;


  public static void main(String[] args) throws Exception {
    doCommnand(initCommand());
  }


  private static void doCommnand(CommandInfo commandInfo) {

    QueueElement[] queueList = commandInfo.stackList;
    for (int i=0; i< queueList.length; i++) {
      queueList[i] = new QueueElement();
    }
    for (int[] commands : commandInfo.commandList) {
      // push t x
      if (commands[0] == 0) {
        queueList[commands[1]].enqueue(commands[2]);
        // top 
      } else if (commands[0] == 1) {
        String value = queueList[commands[1]].front();
        if (value != null) {
          System.out.println(value);
        }
      } else if (commands[0] == 2) {
        queueList[commands[1]].dequeue();
      }
    }
  }

  public static class QueueElement {

    private static final int INITIAL_SIZE = 1000;

    private static final int EXT_SIZE = 500;

    private int beginIndex = 0;
    private int num = 0;
    
    private int[] values;

    public QueueElement() {
      values = new int[INITIAL_SIZE];
    }
    
    public void enqueue(int value) {
      if (beginIndex + num == values.length) {
        extend();
      }
      values[beginIndex + num] = value;
      num++;
    }

    public String front() {
      if (num > 0) {
        return "" + values[beginIndex];
      }
      return null;
    }

    public void dequeue() {
      if (num > 0) {
        beginIndex++;
        num--;
      }
    }

    public void extend() {
      int[] newValues = new int[num + EXT_SIZE];
      for (int i=0; i <num; i++) {
        newValues[i] = values[beginIndex+i];
      }
      values = newValues;
      beginIndex = 0;
    }

  }

  public static class CommandInfo {

    QueueElement[] stackList;
    int[][] commandList;

  }

  private static CommandInfo initCommand() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String headerLine = br.readLine();
    String[] headerElements = headerLine.split(" ");
    if (headerElements.length != 2) {
      throw new IllegalArgumentException(String.format("header line=%s is invalid.", headerLine));
    }
    int vectorNumber = Integer.parseInt(headerElements[0]);
    if (vectorNumber < MIN_QUEUE_NUM || vectorNumber > MAX_QUEUE_NUM) {
      throw new IllegalArgumentException(MIN_QUEUE_NUM+ " <= stackNum <= " + MAX_QUEUE_NUM);
    }
    QueueElement[] stackList = new QueueElement[vectorNumber];

    int commandNum = Integer.parseInt(headerElements[1]);
    if (commandNum < MIN_COMMAND || commandNum > MAX_COMMAND) {
      throw new IllegalArgumentException(MIN_COMMAND + " <= commandNum <= " + MAX_COMMAND);
    }
    int[][] commandList = new int[commandNum][];
    for (int i=0; i< commandNum; i++) {
      String line = br.readLine();
      if (line == null || line.isEmpty()) {
        throw new IllegalArgumentException("command is empty");
      }
      String[] attrs = line.split(" ", -1);
      int[] command = new int[attrs.length]; 
      for (int j=0; j <attrs.length;j++) {
        command[j] = Integer.parseInt(attrs[j]);
      }
      commandList[i] = command;
    }
    CommandInfo commandInfo = new CommandInfo();
    commandInfo.commandList = commandList;
    commandInfo.stackList = stackList;
    return commandInfo;
  }
}

