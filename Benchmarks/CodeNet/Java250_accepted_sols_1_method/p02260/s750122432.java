import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(buf.readLine());
        int[] num=new int[a];
        int i,j,tmp,min;
        int cnt=0;
        String[] str=buf.readLine().split(" ");
        for(i=0;i<num.length;i++){
            num[i]=Integer.parseInt(str[i]);
        }
        
        for(i=0;i<num.length;i++){
            min=i;
            for(j=i+1;j<num.length;j++){
                    if(num[j]<num[min]){
                        min=j;
                    }
            }
            if(i!=min){
                cnt++;
        tmp=num[i];
        num[i]=num[min];
        num[min]=tmp;
            }
        }
        for(int x=0;x<num.length-1;x++){
            System.out.print(num[x]+" ");
}
        System.out.println(num[a-1]);
        System.out.println(cnt);
    }
}