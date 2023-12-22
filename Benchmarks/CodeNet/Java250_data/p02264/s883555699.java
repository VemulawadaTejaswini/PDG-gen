import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,t;
        int nowt=0;
        ArrayList<P> list = new ArrayList<P>();
        n = sc.nextInt();
        t = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String str[] = sc.nextLine().split(" ");
            list.add(new P(str[0],Integer.parseInt(str[1])));
        }
        while(list.size()!=0){
            P p = list.get(0);
            list.remove(0);
            if(p.t<=t){
                nowt+=p.t;
                System.out.println(p.name+" "+nowt);
            }else{
                p.t-=t;
                nowt+=t;
                list.add(p);
            }
        }
    }
}

class P{
    String name;
    int t;
    public P(String s,int tt){
        name = s;
        t = tt;
    }
}
