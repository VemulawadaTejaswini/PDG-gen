import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    try (BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in))) {
      solve(br);
    } catch (IOException e) {
			e.printStackTrace();
		}
  }

  static void solve(BufferedReader br) throws NumberFormatException, IOException {
    int n = Integer.parseInt(br.readLine());
    ArrayDeque<Integer> list = new ArrayDeque<>();// 連結リスト
    String insert = "insert";
    String delete = "delete";
    String delFirst = "deleteFirst";
    String deleteLast = "deleteLast";

    for (int i = 0; i < n; i++) {
      String[] input = br.readLine().split("\\s");

      String command = input[0];
      if (command.equals(insert)) {
        list.addFirst(Integer.parseInt(input[1]));
      } else if (command.equals(delete)) {
        list.removeFirstOccurrence(Integer.parseInt(input[1]));
      } else if (command.equals(delFirst)) {
        list.removeFirst();
      } else if (command.equals(deleteLast)) {
        list.removeLast();
      }
    }

    StringBuilder sb = new StringBuilder();
    list.forEach(e -> sb.append(e).append(' '));
    System.out.println(sb.toString().trim());
  }
}

