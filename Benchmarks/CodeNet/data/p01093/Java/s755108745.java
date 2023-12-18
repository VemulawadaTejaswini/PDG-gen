import java.util.*;                                                              
public class Main{
public static void main(String args[]) throws Exception{
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();sc.nextLine();
while(N!=0){
int[] array = new int[N];
String s = sc.nextLine();
String[] a = s.split(" ");
for(int i=0;i<N;i++){
array[i]=Integer.parseInt(a[i]);
}
Arrays.sort(array);
int abs= 1000;
for(int k=0;k<N-1;k++){
if(abs>array[k+1]-array[k]){
abs=array[k+1]-array[k];
}
}
 System.out.println(abs);
N = sc.nextInt();sc.nextLine();
}
}
