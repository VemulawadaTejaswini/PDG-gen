

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static int MIN_VALUE = -1000000000;
  public static int MAX_VALUE =  1000000000;

  public static int MIN_COMMAND = 1;
  public static int MAX_COMMAND = 200000;

  public static int MIN_VECTOR_NUM = 1;
  public static int MAX_VECTOR_NUM = 1000;


  public static void main(String[] args) throws Exception {
    doCommnand(initCommand());
  }


  private static void doCommnand(CommandInfo commandInfo) {

    StackElement[] stacks = commandInfo.stackList;
    for (int i=0; i< stacks.length; i++) {
      stacks[i] = new StackElement();
    }
    for (int[] commands : commandInfo.commandList) {
      // push t x
      if (commands[0] == 0) {
        stacks[commands[1]].push(commands[2]);
        // top 
      } else if (commands[0] == 1) {
        String value = stacks[commands[1]].top();
        if (value != null) {
          System.out.println(value);
        }
      } else if (commands[0] == 2) {
        stacks[commands[1]].pop();
      }
    }
  }

  public static class StackElement {

    private static final int INITIAL_SIZE = 1000;

    private static final int EXT_SIZE = 500;

    private int valueIndex = -1; 
    
    private int[] values;

    public StackElement() {
      values = new int[INITIAL_SIZE];
    }

    public void push(int value) {
      valueIndex++;
      if (valueIndex == values.length) {
        extend();
      }
      values[valueIndex] = value;
    }

    public String top() {
      if (valueIndex >= 0) {
        return "" + values[valueIndex];
      } else {
        return null;
      }
    }

    public void pop() {
      if (valueIndex >= 0) {
           valueIndex--;
      } else {
           valueIndex = -1;
      }
    }

    public void extend() {
      int[] newValues = new int[values.length + EXT_SIZE];
      for (int i=0; i <values.length; i++) {
        newValues[i] = values[i];
      }
      values = newValues; 
    }

  }

  public static class CommandInfo {

    StackElement[] stackList;
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
    if (vectorNumber < MIN_VECTOR_NUM || vectorNumber > MAX_VECTOR_NUM) {
      throw new IllegalArgumentException(MIN_VECTOR_NUM+ " <= stackNum <= " + MAX_VECTOR_NUM);
    }
    StackElement[] stackList = new StackElement[vectorNumber];

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

