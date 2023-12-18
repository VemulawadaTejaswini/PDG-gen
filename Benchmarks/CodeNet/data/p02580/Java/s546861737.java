//package Quarantine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int h=s.nextInt();
        int w=s.nextInt();
        int m=s.nextInt();
        int ans=0;
        int row[]=new int[h+1];
        int col[]=new int[w+1];
        HashSet<String> set=new HashSet<>();
        for(int i=1;i<=m;i++){
            int x=s.nextInt();
            int y=s.nextInt();
            StringBuilder t=new StringBuilder();
            t.append(x).append(" ").append(y);
            set.add(t.toString());
            row[x]++;
            col[y]++;
        }
        ArrayList<Athelp> rows=new ArrayList<>();
        ArrayList<Athelp> cols=new ArrayList<>();
        for(int i=1;i<=h;i++){
            rows.add(new Athelp(i,row[i]));
        }
        for(int i=1;i<=w;i++){
            cols.add(new Athelp(i,col[i]));
        }
        Collections.sort(rows,Collections.reverseOrder());
        Collections.sort(cols,Collections.reverseOrder());
        for(int i=0;i<rows.size();i++){
            for(int j=0;j<cols.size();j++){
                int temp=rows.get(i).count+cols.get(j).count;
                if(temp<=ans){
                    break;
                }
                StringBuilder t=new StringBuilder();
                t.append(rows.get(i).ind).append(" ").append(cols.get(j).ind);
                if(set.contains(t.toString())){
                    temp--;
                }
                ans=Math.max(ans,temp);
            }
        }
        System.out.println(ans);
    }
}

class  Athelp implements Comparable<Athelp>{
    int ind,count;
    public Athelp(int ind,int count){
        this.ind=ind;
        this.count=count;
    }

    @Override
    public int compareTo(Athelp o) {
        return this.count-o.count;
    }
}
