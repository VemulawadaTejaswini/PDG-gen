import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int S=Integer.parseInt(br.readLine());

    int h=S/3600;
    int m=(S%3600)/60;
    int s=()(S%3600)%60);

    System.out.println(h+":"+m+":"+s);
  }
}

