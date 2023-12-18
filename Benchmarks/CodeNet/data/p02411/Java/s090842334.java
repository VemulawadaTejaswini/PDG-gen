import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int m=0;
    int f=0;
    int r=0;
    for(int i=0;i<50;i++){
      m=sc.nextInt();
      f=sc.nextInt();
      r=sc.nextInt();
      char grade;
      if(m==-1 && f==-1 && r==-1) break;
      else if(m==-1 || f==-1 || m+f<30) grade='F';
      else if(m+f<50 && r<50) grade='D';
      else if(m+f<65) grade='C';
      else if(m+f<80) grade='B';
      else grade='A';
      System.out.println(grade);
    }
  }
}

