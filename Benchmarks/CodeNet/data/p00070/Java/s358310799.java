import java.util.*;
import java.lang.*;

class AOJ0070{


    public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int N,s;
	while(in.hasNext() ){
	    N = in.nextInt();
	    s = in.nextInt();
int cnt=0;
	    for(int i=0;i<=9;i++){
		if(N <= 0)break;
		if(i > s)continue;
		if(i == s && N == 1)cnt++;
		for(int j=0;j<=9;j++){
		    if(N <= 1)break;
		    if(i == j)continue;
		    if(i+j*2 > s)break;
		    if(i+j*2 == s && N == 2)cnt++;
		    for(int k=0;k<=9;k++){
			if(N <= 2)break;
			if(k==i||k==j)continue;
			if(i+j*2+k*3 > s)break;
			if(i+j*2+k*3 == s && N == 3)cnt++;
			for(int l=0;l<=9;l++){
			    if(N <= 3)break;
			    if(l==i||l==j||l==k)continue;
			    if(i+j*2+k*3+l*4 > s)break;
			    if(i+j*2+k*3+l*4 == s && N == 4)cnt++;
			    for(int m=0;m<=9;m++){
				if(N <=4 )break;
				if(m==i||m==j||m==k||m==l)continue;
				if(i+j*2+k*3+l*4+m*5 > s)break;
				if(i+j*2+k*3+l*4+m*5 == s && N== 5)cnt++;
				for(int n=0;n<=9;n++){
				    if(N <=5 )break;
				    if(n==i||n==j||n==k||n==l||n==m)continue;
				    if(i+j*2+k*3+l*4+m*5+n*6 > s)break;
				    if(i+j*2+k*3+l*4+m*5+n*6== s && N == 6)cnt++;
				    for(int o=0;o<=9;o++){
					if(N <=6 )break;
					if(o==i||o==j||o==k||o==l||o==m||o==n)continue;
					if(i+j*2+k*3+l*4+m*5+n*6+o*7 > s)break;
					if(i+j*2+k*3+l*4+m*5+n*6+o*7 == s && N == 7)cnt++;
					for(int p=0;p<=9;p++){
					    if(N <=7 )break;
					    if(p==i||p==j||p==k||p==l||p==m||p==n||p==o)continue;
					    if(i+j*2+k*3+l*4+m*5+n*6+o*7+p*8 > s)break;
					    if(i+j*2+k*3+l*4+m*5+n*6+o*7+p*8 == s & N == 8)cnt++;
					    for(int q=0;q<=9;q++){
						if(N <=8 )break;
						if(q==i||q==j||q==k||q==l||q==m||q==n||q==o||q==p)continue;
if(i+j*2+k*3+l*4+m*5+n*6+o*7+p*8+q*9 > s)break;
						if(i+j*2+k*3+l*4+m*5+n*6+o*7+8*p+q*9 == s & N == 9)cnt++;
					    }
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	    //int div=1;
	    //for(int i=2;i<=N;i++)div*=i;
	    System.out.println(cnt);


	}

    }

}