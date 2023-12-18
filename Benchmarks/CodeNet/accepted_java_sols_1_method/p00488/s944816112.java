import java.util.*;
class Main{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    int n[]=new int[5];
    for(int i=0;i<5;i++){
    	n[i]=s.nextInt();
    }
    s.close();
    int minA=n[0];
    if(minA>n[1])minA=n[1];
    if(minA>n[2])minA=n[2];
    int minB=n[3];
    if(minB>n[4])minB=n[4];
    System.out.println(minA+minB-50);
  }
}
