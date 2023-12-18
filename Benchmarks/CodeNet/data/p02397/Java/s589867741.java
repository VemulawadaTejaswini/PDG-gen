import java.util.Scanner;
public class Main { 
public static void main(String args[]) { 
int n[] = new int[3000];
int m[] = new int[3000];
Scanner sc = new Scanner(System.in);
n[0]=sc.nextInt();
m[0]=sc.nextInt();
int x=0;
while(n[x]!=0 && m[x]!=0){
    if(n[x]>m[x]){
        int temp=n[x];
        n[x]=m[x];
        m[x]=temp;
    }
    n[x+1]=sc.nextInt();
    m[x+1]=sc.nextInt();
    x=x+1;
}

for(int i=0;i<x;i++){
    System.out.print(n[i]);
    System.out.print(" ");
    System.out.println(m[i]);
}
 } }
