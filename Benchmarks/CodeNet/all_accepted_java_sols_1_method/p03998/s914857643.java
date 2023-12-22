import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String a[]=line.split("",0);
        ArrayList<String> as=new ArrayList<String>();
        for(int i=0;i<a.length;i++){
            as.add(a[i]);
        }
        line = sc.nextLine();
        String b[]=line.split("",0);
        ArrayList<String> bs=new ArrayList<String>();
        for(int i=0;i<b.length;i++){
            bs.add(b[i]);
        }
        line = sc.nextLine();
        String c[]=line.split("",0);
        ArrayList<String> cs=new ArrayList<String>();
        for(int i=0;i<c.length;i++){
            cs.add(c[i]);
        }
        String turn="a";
        boolean h=true;
        while (h){
            switch(turn){
                case "a":
                    if(as.size()==0){
                        turn="A";
                        h=false;
                    }
                    else{
                        turn=as.get(0);
                        as.remove(0);
                    }
                    break;
                case "b":
                    if(bs.size()==0){
                        turn="B";
                        h=false;
                    }
                    else{
                        turn=bs.get(0);
                        bs.remove(0);
                    }
                    break;
                case "c":
                    if(cs.size()==0){
                        turn="C";
                        h=false;
                    }
                    else{
                        turn=cs.get(0);
                        cs.remove(0);
                    }
                    break;
            }
        }
        System.out.println(turn);
    }
}