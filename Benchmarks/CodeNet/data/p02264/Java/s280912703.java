import java.io.*;
import java.util.*;



public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        str = br.readLine();
        String[] strs = str.split("\\s");
        int n = Integer.parseInt(strs[0]);
        int q = Integer.parseInt(strs[1]);

        Queue<Myp> d = new ArrayDeque<Myp>();
        for(int i =0;i<n;i++){
            str = br.readLine();
            String[] temp = str.split("\\s");
            d.offer(new Myp(temp[0],Integer.parseInt(temp[1])));
        }
        
        int endtime = 0;
        while(!d.isEmpty()){
            Myp p = d.poll();
            if(p.gettime() > q){
                p.settime(p.gettime() - q);
                d.offer(p);
                endtime += q;
            }else{
                endtime += p.gettime();
                System.out.println(p.getname() + " " + endtime);
            }
        }

        br.close();
    }
   
}

class Myp{
    private String name;
    private int time;
    
    Myp(String n,int t){
        this.name= n;
        this.time = t;
    }

    Myp(){
        this("",0);
    }
    public String getname(){
        return this.name;
    }

    public int gettime(){
        return this.time;
    }

    public void settime(int t){
        this.time = t;
    }
}
