import java.util.*;
import java.io.*;
class Main{
  static void main(String[] args){
    String str1="";
  BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
int T= Integer.parseInt(inp.readLine()); // for taking a number as an input
    for(int i=0;i<T;i++){
      str1=str1 +"ACL";
    }
    System.out.println(str1);
  }
}   
