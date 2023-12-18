import java.io.*;
public class Main{
   public static void main(String[] args)throws IOException{
InputStreamReader is = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(is);

String str = br.readLine();
String hairetu = br.readLine();
int n = Integer.parseInt(str);
int[] space = new int[n-1];
String[] arr = new String[n];
int[] arr_int = new int[n];

space[0] = hairetu.indexOf(" ");

for(int i = 1; i < n-1; i++){
 space[i] = hairetu.indexOf(" ", space[i-1]+1);
}

arr[0] = hairetu.substring(0, space[0]);
for(int i = 1; i < n-1; i++){
 arr[i] = hairetu.substring(space[i-1]+1, space[i]);
}

arr[n-1] = hairetu.substring(space[n-2]+1, hairetu.length());

for(int i = 0; i < n; i++){
 if(i != 0)
  System.out.print(" ");
 System.out.print(arr[n-i-1]);
}
 System.out.println();

}
}