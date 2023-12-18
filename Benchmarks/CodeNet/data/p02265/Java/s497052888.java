import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),first=0,num=1;
        int list[]=new int[1000000];
        int before[]=new int[100000];
        int next[]=new int[1000000];

        for(int i=0;i<n;i++){
            String o=s.next();
            if(o.equals("insert")){
                list[num]=s.nextInt();
                //System.out.println(o+" "+list[num]);
                before[first]=num;
                next[num]=first;
                first=num;
                num++;
            }else if(o.equals("delete")){
                int d=s.nextInt();
                int j=first;
                while(true){
                    if(d==list[j]){
                        if(j==first){
                            first=next[j];
                            before[first]=0;
                        }
                        next[before[j]]=next[j];
                        before[next[j]]=before[j];
                        break;
                    }
                    if(next[j]==0) break;
                    j=next[j];
                }
            }else if(o.equals("deleteFirst")){
                first=next[first];
                before[first]=0;
            }else{
                int j=first;
                while(true){
                    if(next[j]==0){
                        if(j==first){
                            first=0;
                        }else{
                            next[before[j]]=0;
                        }
                        break;
                    }
                    j=next[j];
                }
            }
        }
        int soeji=first;

        /*for(int i=0;i<=4;i++){
            System.out.print(list[i]);
        }
        System.out.println("");
        for(int i=0;i<=4;i++){
            System.out.print(next[i]);
        }
        System.out.println("");
        */
        while(soeji!=0){
            System.out.print(list[soeji]);
            soeji=next[soeji];
            if(soeji!=0) System.out.print(" ");
        }
        System.out.println("");
    }
}
