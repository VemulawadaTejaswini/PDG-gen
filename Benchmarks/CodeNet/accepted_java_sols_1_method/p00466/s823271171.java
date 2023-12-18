import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        while (true){
        int total =scan.nextInt();
        if(total==0 )break;
        int sum=0;
        for(int i=0;i<9;i++)sum+=scan.nextInt();
        System.out.println(total-sum);
        }

  }
  }