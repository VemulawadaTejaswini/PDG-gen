import java.util.Scanner;

class Main {

public static void main(String[] args){
     

      Scanner sc = new Scanner(System.in);

      int Smax = sc.nextInt();



System.out.println((Smax / 3600) + ":" + ((Smax/60)%60) + ":" + (Smax % 60));

}
}

