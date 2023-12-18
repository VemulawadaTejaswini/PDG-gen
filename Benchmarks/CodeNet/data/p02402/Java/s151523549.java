import java.io.*;
class Main{
public static void main(String[] args){
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str1=br.readLine();
int n=Integer.parseInt(str1);
String str2=br.readLine();
String[] arr=str2.split(" ");
int sum=0;
for(int i=0; i<n; i++){
sum +=arr[i];
}
int min=arr[0], max=arr[0];
for(int j=1; j<n; j++){
if(min > arr[j]) min=arr[j];
if(max < arr[j]) max=arr[j];
}
System.out.println(min+" "+max+" "+sum);
br.close();
}
}