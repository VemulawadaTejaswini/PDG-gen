import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
            boolean kkt=true;
            ArrayList<Integer> r = new ArrayList<Integer>();
            ArrayList<Integer> g = new ArrayList<Integer>();
            ArrayList<Integer> b = new ArrayList<Integer>();
            int[] a=new int[10];
            char[] s = new char[10];
            for(int j=0;j<9;j++){
                a[j]=scan.nextInt();
            }
            for(int j=0;j<9;j++){
                s[j]=scan.next().charAt(0);
            }
            for(int j=0;j<9;j++){
                if(s[j]=='R'){
                    r.add(a[j]);
                }
                else if(s[j]=='G'){
                    g.add(a[j]);
                }
                else {
                    b.add(a[j]);
                }
            }
            Collections.sort(r);
            Collections.sort(g);
            Collections.sort(b);
            if(r.size()%3!=0||g.size()%3!=0||b.size()%3!=0){
                System.out.println(0);
                continue;
            }

            ArrayList<Integer> nr = new ArrayList<Integer>();
            ArrayList<Integer> ng = new ArrayList<Integer>();
            ArrayList<Integer> nb = new ArrayList<Integer>();

            for(int j=0;j<r.size();j++){
                if(j<r.size()-2){
                    if(r.get(j)==r.get(j+1)&&r.get(j)==r.get(j+2)){
                        j+=2;
                    }
                    else{
                        nr.add(r.get(j));
                    }
                }
                else nr.add(r.get(j));
            }
            for(int j=0;j<nr.size()-2;j++){
                if(nr.get(j)+1==nr.get(j+1)&&nr.get(j+1)+1==nr.get(j+2)){
                    j+=2;
                }
                else if(j<nr.size()-5){
                    if(nr.get(j)==nr.get(j+1)&&nr.get(j)+1==nr.get(j+2)&&nr.get(j+2)==nr.get(j+3)&&nr.get(j+3)+1==nr.get(j+4)&&nr.get(j+4)==nr.get(j+5)){
                        j+=5;
                    }
                    else{
                        kkt=false;
                        break;
                    }
                }
                else{
                    kkt=false;
                    break;
                }
            }
            //System.out.println(g.size());
            for(int j=0;j<g.size();j++){
                //System.out.println(j+" "+g.get(j));
                if(j<g.size()-2){
                    if(g.get(j)==g.get(j+1)&&g.get(j)==g.get(j+2)){
                        j+=2;
                    }
                    else{
                        ng.add(g.get(j));
                    }
                }
                else ng.add(g.get(j));
            }
            for(int j=0;j<ng.size()-2;j++){
                if(ng.get(j)+1==ng.get(j+1)&&ng.get(j+1)+1==ng.get(j+2)){
                    j+=2;
                }
                else if(j<ng.size()-5){
                    if(ng.get(j)==ng.get(j+1)&&ng.get(j)+1==ng.get(j+2)&&ng.get(j+2)==ng.get(j+3)&&ng.get(j+3)+1==ng.get(j+4)&&ng.get(j+4)==ng.get(j+5)){
                        j+=5;
                    }
                    else{
                        kkt=false;
                        break;
                    }
                }
                else{
                    kkt=false;
                    break;
                }
            }
            for(int j=0;j<b.size();j++){
                if(j<b.size()-2){
                    if(b.get(j)==b.get(j+1)&&b.get(j)==b.get(j+2)){
                        j+=2;
                    }
                    else{
                        nb.add(b.get(j));
                    }
                }
                else nb.add(b.get(j));
            }
            for(int j=0;j<nb.size()-2;j++){
                if(nb.get(j)+1==nb.get(j+1)&&nb.get(j+1)+1==nb.get(j+2)){
                    j+=2;
                }
                else if(j<nb.size()-5){
                    if(nb.get(j)==nb.get(j+1)&&nb.get(j)+1==nb.get(j+2)&&nb.get(j+2)==nb.get(j+3)&&nb.get(j+3)+1==nb.get(j+4)&&nb.get(j+4)==nb.get(j+5)){
                        j+=5;
                    }
                    else{
                        kkt=false;
                        break;
                    }
                }
                else{
                    kkt=false;
                    break;
                }
            }
            if(kkt==true){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
