import java.io.*;
import java.util.*;

class Main{

  public static void main(String[] args) throws IOException{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     String str = br.readLine();

     String[] strAry = str.split(" ");

     int ar[] = new int[strAry.length];

     for(int i=0;i<strAry.length;i++){
	ar[i] = Integer.parseInt(strAry[i]);
     }

    for(int j=0;j<strAry.length;j++){
    if(ar[j]<1){
	break;
     }
     else{
        System.out.println("Case " + j + ":" +ar[j]);
     }

     }

}

}