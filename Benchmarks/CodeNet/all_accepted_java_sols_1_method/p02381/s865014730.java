import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=1;

    while(n!=0){
      n = sc.nextInt();
      if(n==0) {
        break;
      }
      int [] s;
      s = new int [n];
      for(int i=0;i<n;i++){
        s[i] = sc.nextInt();
      }
      double var=0,ave=0;
       for(int i=0;i<n;i++){
         ave += s[i];
       }
       ave = (double)ave/n;

       for(int i=0;i<n;i++){
         var += ((double)s[i]-ave)*((double)s[i]-ave);
       }
       var = var/n;
       System.out.printf("%.8f\n",Math.sqrt(var));
    }
    sc.close();
  }
}

