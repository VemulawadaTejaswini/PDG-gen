import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        ArrayList<Long> F = new ArrayList<>();
        ArrayList<Long> L = new ArrayList<>();
        StringBuilder opt = new StringBuilder();
        for(int i=0;i<q;i++){
            int cmd = sc.nextInt();
            int cmd1 = sc.nextInt();
            if(cmd==0){
                if(cmd1==0)F.add(sc.nextLong());
                else L.add(sc.nextLong());
            }
            else if(cmd==2){
                if(cmd1==0){
                    if(F.size()!=0)F.remove(F.size()-1);
                    else L.remove(0);
                }
                else{
                    if(L.size()!=0)L.remove(L.size()-1);
                    else F.remove(0);
                }
            }
            else{
                if(cmd1>F.size()-1)opt.append(L.get(cmd1-F.size())+"\n");
                else opt.append(F.get(F.size()-1-cmd1)+"\n");
            }
        }
        System.out.print(opt);
    }
}
