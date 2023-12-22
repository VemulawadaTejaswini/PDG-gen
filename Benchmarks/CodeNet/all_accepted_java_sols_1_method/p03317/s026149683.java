import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(),k=sc.nextInt();
    int m=-1;
    for(int i=0;i<n;i++)if(sc.nextInt()==1)m=i;
    System.out.println((n-2)/(k-1)+1);
  }
}