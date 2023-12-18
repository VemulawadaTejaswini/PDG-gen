import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // 探索されるデータを入力
    int data_number = Integer.parseInt(scan.next());
    int data[] = new int[data_number];
    for (int i = 0; i < data_number; i++) {
      data[i] = Integer.parseInt(scan.next());
    }
    // 探索したいデータを入力
    int search_key_number  = Integer.parseInt(scan.next());
    int search_key[] = new int[search_key_number];
    for (int i = 0; i < search_key_number; i++) {
      search_key[i] = Integer.parseInt(scan.next());
    }



    // 探索を開始
    int count = 0;
    for (int i = 0; i < search_key_number; i++) {
      if (LinerSearch(search_key[i], data, data_number) != -1) {
        count++;
      }
    }

    System.out.println(count);
  }

  private static int LinerSearch(int search_key, int data[], int data_number) {
    for (int i = 0; i < data_number; i++) {
      if (search_key == data[i]) {
        return i;
      }
    }
    return -1;
  }
}

