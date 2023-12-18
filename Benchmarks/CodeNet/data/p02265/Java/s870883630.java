import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Math;

enum CmdOp {
  INSERT("insert"),
  DELETE("delete"),
  DELETE_FIRST("deleteFirst"),
  DELETE_LAST("deleteLast"),
  UNDEFINED("UNDEFINED");

  private String name;

  private CmdOp(String str) {
    this.name = str;
  }

  private String getName() {
    return name;
  };

  @Override
  public String toString() {
    return getName();
  }

  public static CmdOp cmdStrToCmdOp(String cmd) {
    CmdOp ret;
    switch(cmd) {
      case "insert":
        ret = CmdOp.INSERT;
        break;
      case "delete":
        ret = CmdOp.DELETE;
        break;
      case "deleteFirst":
        ret = CmdOp.DELETE_FIRST;
        break;
      case "deleteLast":
        ret = CmdOp.DELETE_LAST;
        break;
      default:
        ret = CmdOp.UNDEFINED;
        break;
    }

    return ret;
  }

}

class Cmd {
  private final CmdOp cmd;
  private final int target;

  public Cmd(String cmd, int target) {
    this.cmd = CmdOp.cmdStrToCmdOp(cmd);
    this.target = target;
  }


  public int getTarget() {
    return target;
  }

  public CmdOp getCmdOp() {
    return cmd;
  }

  @Override
  public String toString() {
    return "cmd: " + cmd.toString() +  ", target: " + getTarget();
  }

}

class Node {
  public Node next;
  public Node prev;
  public Node last;
  public int value;

  public Node(int value) {
    this.value = value;
  }
}

class LinkedList {
  Node head;

  public LinkedList() {}

  public void insert(int x) {
    Node tmp = head;

    head = new Node(x);
    head.next = tmp;
    head.prev = null;

    if (tmp != null) {
      tmp.prev = head;
    }
  }

  public boolean delete(int x) {
    Node cursor = head;
    while (cursor != null) {
      if (cursor.value == x) {
        if (cursor == head) {
          deleteFirst();
          return true;
        }
        if (cursor.prev != null) {
          cursor.prev.next = cursor.next;
        }
        if (cursor.next != null) {
          cursor.next.prev = cursor.prev;
        }
        cursor.prev = null;
        cursor.next = null;
        return true;
      }
      cursor = cursor.next;
    }

    return false;
  }

  public boolean deleteFirst() {
    if (head == null) {
      return false;
    }

    // candidate of head
    Node cursor = head.next;
    if (cursor.prev != null) {
      cursor.prev = null;
    }

    head = cursor;

    return true;
  }

  public boolean deleteLast() {
    if (head == null) {
      return false;
    }

    Node cursor = head;
    while (cursor.next != null) {
      cursor = cursor.next;
    }

    if (cursor.prev != null) {
      cursor.prev.next = null;
    }
    cursor.prev = null;
    if (cursor == head) {
      head = null;
    }

    return true;
  }

  public void print() {
    StringBuilder buf = new StringBuilder();
    Node cursor = head;
    while (cursor != null) {
      buf.append(cursor.value);
      buf.append(" ");
      cursor = cursor.next;
    }
    System.out.println(buf.toString().trim());
  }
}


public class Main {
  private static int N;
  private static ArrayList<Cmd> cmds;
  private static LinkedList head;

  private static void run() {
    head = new LinkedList();
    for (Cmd cmd: cmds) {
      switch(cmd.getCmdOp()) {
      case INSERT:
        head.insert(cmd.getTarget());
        break;
      case DELETE:
        head.delete(cmd.getTarget());
        break;
      case DELETE_FIRST:
        head.deleteFirst();
        break;
      case DELETE_LAST:
        head.deleteLast();
        break;
      default:
        System.out.println("error");
        break;
      }
    }
    head.print();
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    N = in.nextInt();

    cmds = new ArrayList<Cmd>(N);
    for (int i = 0; i < N; i++) {
      String cmdstr = in.next();
      if (cmdstr.equals("deleteFirst") || cmdstr.equals("deleteLast")) {
        cmds.add(new Cmd(cmdstr, 0));
      } else {
        cmds.add(new Cmd(cmdstr, in.nextInt()));
      }
    }

    //for (Cmd cmd: cmds) {
    //  System.out.println(cmd);
    //}

    // init
    run();
  }
}