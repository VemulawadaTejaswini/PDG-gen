import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        new Main().solve();
    }

    void solve(){

        Scanner cin = new Scanner(System.in);
        int MAX = 999999;
        while(true)
        {
            int n = cin.nextInt();
            int m = cin.nextInt();
            if(n==0) return;
            int[] e = new int[m];
            for(int i=0;i<m;i++){
            	e[i] = (cin.nextInt()-1) + (cin.nextInt()-1) * 100 + (cin.nextInt()) * 10000;
            }
            Arrays.sort(e);


            int ret = MAX;

            int precost = -1;

            for(int i=0;i<m;i++){
            	int firstcost = e[i] / 10000;
            	if(firstcost==precost) continue;
            	precost = firstcost;
            	init(n);
            	for(int j=i;j<m;j++){
            		int cost = e[j]/ 10000;
            		int a = e[j]/100 % 100;
            		int b = e[j] % 100;
            		connect(a,b);
            		if(size(0)==n){
            			ret = Math.min(ret, cost - firstcost);
            			break;
            		}
            	}

            	if(size(0)!=n) break;
            }
            if(ret==MAX) System.out.println(-1);
            else System.out.println(ret);
        }
    }

    int[] uni;

    void init(int n){
    	uni = new int[n];
    	for(int i=0;i<n;i++) uni[i] = -1;
    }

    int getuni(int a){
    	if(uni[a]<0) return a;
    	else return uni[a] = getuni(uni[a]);
    }

    void connect(int a, int b){
    	a = getuni(a);
    	b = getuni(b);
    	if(a==b) return;
    	uni[a] += uni[b];
    	uni[b] = a;
    }

    int size(int a){
    	return -uni[getuni(a)];
    }
}