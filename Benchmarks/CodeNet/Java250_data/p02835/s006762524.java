import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    Scanner sc=new Scanner(System.in);
    int ans=0;
    for(int i=0;i<3;i++){
      ans+=sc.nextInt();
    }
    System.out.println(ans>=22?"bust":"win");
  }
}