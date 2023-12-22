import java.io.*;
import java.util.*;
    
class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=10;
int[] k=new int[n];
for(int i=0;i<n;i++){
k[i]=Integer.parseInt(br.readLine());
}
Arrays.sort(k);
for(int i=0;i<3;i++){
System.out.println(k[n-i-1]);
}
}
}