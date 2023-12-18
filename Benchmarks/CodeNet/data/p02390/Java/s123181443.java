import.java.util.Scanner;

class Main {

public static void main(String []  args){
     

      Scanner sc = new Scanner(System.in);

      int Smax = sc.nextInt();

      int h = (int)(Smax / 3600);
      int m = (int)((Smax % 3600) / 60);
      int s = (int)(((Smax % 3600) % 60) / 60);

System.out.println(h + ":" + m + ":" + s);

}
}

