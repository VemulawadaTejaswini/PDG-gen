import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

int n,z = 0,count = 0;
boolean is;

while(sc.hasNextInt()){
n = sc.nextInt();
if(n == 0)break;
int[] N = new int[n];
z = 0;
count = 0;

for(int i = 2; i <= n; i++){
int x = i;
is = true;
for(int j = 2; j < Math.qurt(i ); j++)
if(i % j == 0){
is = false;
break;
}
if(is){
N[z] = i;
z++;
}
}
for(int i = 0; i < n; i++)
for(int j = i; j < n; j++)
if(N[i] + N[j] == n)count++;

System.out.println(count);
}
sc.close();
}
}