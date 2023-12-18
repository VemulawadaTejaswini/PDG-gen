import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
public static void main(String[] args) throws FileNotFoundException, IOException{
      Scanner in=new Scanner(System.in);
      // BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
       int n=in.nextInt();
       Map<Integer,int[][]>map=new HashMap<>();
       for(int i=0;i<n;i++){
       	int a=in.nextInt();
       	int[][] arr=new int[a][2];
       	for(int j=0;j<a;j++){
       		arr[j]=new int[]{in.nextInt()-1,in.nextInt()};
       	}
       	map.put(i,arr);
       }

       int res=0;
       for(int i=0;i<(1<<n);i++){
       	boolean b=true;
       	for(int j=0;j<n;j++){
       		if((i&1<<j)==0){continue;} // if jth person is not honest
          //else checks if all of his/her testimonials arr true for all honest
          // person then this combination is a valid one update the result
          // we should not check testimonials of unkind person bcz if we do then
          // it will be either true or false..and both are valid bcz he/she is unkind
       		for(int[] t:map.get(j)){
       			if((t[1]==0&&(i&1<<t[0])!=0)||(t[1]==1&&(i&1<<t[0])==0)){
       				b=false;break;
       			}
       		}
       	}
       	if(b){
       			res=Math.max(res,Integer.bitCount(i));
       		}
       }
       out.write(res+"");
       out.flush();
      }
        }
    
