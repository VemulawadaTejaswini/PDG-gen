import java.util.*;

class Main{
    public static void main(String[] args){
    	Scanner sc= new Scanner(System.in);
int n=sc.nextInt(); int []p=new int[n];
int m=sc.nextInt(); int []t=new int[m];
for(int i=0;i<m;i++)t[i]=sc.nextInt();
for(int i=0;i<m;i++){
	for(int j=0;j<n;j++){
		if(sc.nextInt()==t[i]){
			p[j]++;
		}else  p[t[i]-1]++;
	}
}
for(int i=0;i<n;i++)System.out.println(p[i]);
    }
}