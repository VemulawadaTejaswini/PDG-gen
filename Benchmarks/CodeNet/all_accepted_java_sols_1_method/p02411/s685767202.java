import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int number=3;
    int array1[]=new int[number];
    int array2[]=new int[number];
    while(true){
      for(int i=0;i<number;i++){
        array1[i]=sc.nextInt();
        array2[i]=1;
      }
      int score=array1[0]+array1[1];
      int at=array1[0]*array1[1];
      int check=0,help=0;
      for(int i=0;i<number;i++){
        if(array1[i]==-1) array2[i]=0;
        check+=array2[i];
      }
      if(check==0)break;
      if(array1[2]>=50)help=1;
      if(at<0||score<30)System.out.println("F");
      else if(score>=80)System.out.println("A");
      else if(score>=65)System.out.println("B");
      else if(help==1||50<=score)System.out.println("C");
      else if(score<50)System.out.println("D");
    }
      sc.close();
  }
}
