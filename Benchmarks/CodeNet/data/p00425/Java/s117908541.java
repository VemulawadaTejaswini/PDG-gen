import java.util.*;

class Main {
    final static String[] hougaku = {"North","East","South","West","Right","Left"};
    final static int[] taiou = {1,2,3,4,5,6};

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int top=1,n=5,e=3,w=4,s=2,b=6;
            int ans=1;
            int temp;
            int kaisu = sc.nextInt();
            String move;
            if(kaisu==0)break;
            for(int i=0;i<kaisu;i++){
                move=sc.next();
                if(hougaku[0].equals(move)){
                    temp=top;
                    top=s;
                    s=b;
                    b=n;
                    n=temp;
                }else if(hougaku[1].equals(move)){
                    temp=top;
                    top=w;
                    w=b;
                    b=e;
                    e=temp;
                }else if(hougaku[2].equals(move)){
                    temp=top;
                    top=n;
                    n=b;
                    b=s;
                    s=temp;
                }else if(hougaku[3].equals(move)){
                    temp=top;
                    top=e;
                    e=b;
                    b=w;
                    w=temp;
                }else if(hougaku[4].equals(move)){
                    temp=w;
                    w=s;
                    s=e;
                    e=n;
                    n=temp;
                }else if(hougaku[5].equals(move)){
                    temp=w;
                    w=n;
                    n=e;
                    e=s;
                    s=temp;
                }
                ans+=top;
            }
            System.out.println(ans);
        }
    }
}