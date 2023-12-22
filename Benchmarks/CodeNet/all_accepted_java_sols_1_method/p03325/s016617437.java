import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long a[] = new long[N];
		for(int i=0; i<N; i++){
			a[i] = sc.nextInt();
		}
		long count = 0;
				for(int i=0; i<N; i++){
			if(a[i]%2==0)count++;
		}		for(int i=0; i<N; i++){
			if(a[i]%4==0)count++;
		}		for(int i=0; i<N; i++){
			if(a[i]%8==0)count++;
		}		for(int i=0; i<N; i++){
			if(a[i]%16==0)count++;
		}		for(int i=0; i<N; i++){
			if(a[i]%32==0)count++;
		}		for(int i=0; i<N; i++){
			if(a[i]%64==0)count++;
		}		for(int i=0; i<N; i++){
			if(a[i]%128==0)count++;
		}		for(int i=0; i<N; i++){
			if(a[i]%256==0)count++;
		}		for(int i=0; i<N; i++){
			if(a[i]%512==0)count++;
		}		for(int i=0; i<N; i++){
			if(a[i]%1024==0)count++;
		}		for(int i=0; i<N; i++){
			if(a[i]%2048==0)count++;
		}		for(int i=0; i<N; i++){
			if(a[i]%4096==0)count++;
		}		for(int i=0; i<N; i++){
			if(a[i]%8192==0)count++;
		}		for(int i=0; i<N; i++){
			if(a[i]%16384==0)count++;
		}		for(int i=0; i<N; i++){
			if(a[i]%32768==0)count++;
		}		for(int i=0; i<N; i++){
			if(a[i]%65536==0)count++;
		}		for(int i=0; i<N; i++){
			if(a[i]%131072==0)count++;
		}		for(int i=0; i<N; i++){
			if(a[i]%262144==0)count++;
		}		for(int i=0; i<N; i++){
			if(a[i]%524288==0)count++;
		}		for(int i=0; i<N; i++){
			if(a[i]%1048576==0)count++;
		}		for(int i=0; i<N; i++){
			if(a[i]%2097152==0)count++;
		}		for(int i=0; i<N; i++){
			if(a[i]%4194304==0)count++;
		}		for(int i=0; i<N; i++){
			if(a[i]%8388608==0)count++;
		}		for(int i=0; i<N; i++){
			if(a[i]%16777216==0)count++;
		}		for(int i=0; i<N; i++){
			if(a[i]%33554432==0)count++;
		}		for(int i=0; i<N; i++){
			if(a[i]%67108864==0)count++;
		}		for(int i=0; i<N; i++){
			if(a[i]%134217728==0)count++;
		}		for(int i=0; i<N; i++){
			if(a[i]%268435456==0)count++;
		}
				for(int i=0; i<N; i++){
			if(a[i]%536870912==0)count++;
		}
		System.out.println(count);
	}
}