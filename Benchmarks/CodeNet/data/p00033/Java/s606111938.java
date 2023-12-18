import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        
        /*
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int[] coin_list=new int[m];
        for(int i=0;i<m;i++){
            coin_list[i]=Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.toString(coin_list));
        */
        
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int[] list=new int[10];
            for(int j=0;j<10;j++){
                list[j]=Integer.parseInt(st.nextToken());
            }if(dfs(list,0,0,0)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    
    
    static boolean dfs(int[] list,int a,int b,int index){
        if(index==list.length) return true;
        if(a<list[index]){
            if(dfs(list,list[index],b,index+1)){
                return true;
            }
        }if(b<list[index]){
            if(dfs(list,a,list[index],index+1)){
                return true;
            }
        }
        return false;
    }
    
}