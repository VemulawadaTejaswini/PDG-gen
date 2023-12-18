import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    String tem[] = str.split(" ",0);
    int num[] = new int[tem.length];

    for(int i = 0;i < tem.length;i++){
        num[i] = Integer.parseInt(tem[i]);
    }

    if(num[0] < num[1] && num[1] < num[2]){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}

