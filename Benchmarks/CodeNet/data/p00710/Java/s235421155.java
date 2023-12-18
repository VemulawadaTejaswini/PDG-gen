import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

while(true){
int n=Integer.parseInt(sc.next());
int r=Integer.parseInt(sc.next());
int[] card=new int[n];
for(int i=0;i<n;i++){card[i]=i+1;}
if(n==0&&r==0)break;
for(int i=0;i<r;i++){
int p=Integer.parseInt(sc.next());
int c=Integer.parseInt(sc.next());
int[] temp=new int[n];
    for(int j=n-p-c+1;j<=n-p;j++){
    temp[j]=card[j];
    }
    for(int k=n-1;k>n-p;k--){
    temp[k]=card[k];
    }

    for(int j=n-p-c+1;j<=n-c-1;j++){
    card[j]=temp[j+c];
    }

    for(int j=n-c;j<n;j++){
    card[j]=temp[j-p+1];
    }
}

System.out.println(card[n-1]);
}


}
}
