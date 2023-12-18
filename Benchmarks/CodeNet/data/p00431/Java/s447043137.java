import java.util.*;
import java.io.*;
class StringwithRing{
    public static void main(String[] args){
        ArrayList<Integer> result=new ArrayList<Integer>();
        try{
            BufferedReader fin=new BufferedReader(new FileReader("input.txt"));
            while(true){

                String sc=fin.readLine();
                int n=Integer.parseInt(sc);
                if(n==0)break;
                //System.out.println(n);                                                                                                                                                                    
                int sub=0;
                int[][] data=new int[n][2];
                Reflexive r=new Reflexive();
                r.getmax(1);
                for(int i=0;i<n;i++){
                    sub=Integer.parseInt(fin.readLine());
                    //  System.out.println(sub);                                                                                                                                                            
                    data[i][0]=(sub-(sub%10))/10;
                    data[i][1]=sub%10;
                    //System.out.println(""+data[i][0]+""+data[i][1]);                                                                                                                                      
                }

                for(int i=0;i<n;i++){

                    ArrayList<Integer> l=new ArrayList<Integer>();
                    l.add(i);
                    r.ref(n,l,data[i][0],data[i][1],data,i);
                    r.ref(n,l,data[i][1],data[i][0],data,i);

                }
                result.add(r.getmax());
                //System.out.println("      "+r.getmax());                                                                                                                                                  
            }
            fin.close();

        }catch(Exception e){
            System.out.println(e);
        }
        try{
            PrintWriter fout=new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            for(int i=0;i<result.size();i++){
                fout.println(result.get(i));
            }
            fout.close();
        }catch(Exception e){
            System.exit(1);
        }

    }
class Reflexive{
    private int max=0;
    public int ref(int num,ArrayList<Integer> flll,int front,int rear,int[][] data,int now){

        if(num==max||front==rear)return 0;
        for(int i=0;i<num;i++){
            if(now==i||flll.indexOf(i)!=-1)continue;
            if(front==data[i][1]){

                flll.add(i);
                maxjd(flll,data,front,rear);
                ref(num,flll,rear,data[i][0],data,now);
                flll.remove(flll.indexOf(i));
            }
            if(rear==data[i][1]){
                flll.add(i);
                maxjd(flll,data,front,rear);
                ref(num,flll,front,data[i][0],data,now);
                flll.remove(flll.indexOf(i));

            }
            if(front==data[i][0]){
                flll.add(i);
                maxjd(flll,data,front,rear);
                ref(num,flll,rear,data[i][1],data,now);
                flll.remove(flll.indexOf(i));
            }
            if(rear==data[i][0]){
                flll.add(i);
                maxjd(flll,data,front,rear);
                ref(num,flll,front,data[i][1],data,now);
                flll.remove(flll.indexOf(i));
            }

        }
        return 0;
    }
    public int maxjd(ArrayList<Integer> flll,int[][] data,int front,int rear){
        ArrayList<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<flll.size();i++){
            l.add(data[flll.get(i)][0]);
            l.add(data[flll.get(i)][1]);
        }

        for(int i=0;i<l.size();i++){
            int count=0;
            for(int j=0;j<l.size();j++){
                if(i!=j&&l.get(i)==l.get(j))count++;
            }
            if(count>=2&&front==l.get(i))return 0;
            if(count>=2&&rear==l.get(i))return 0;
        }

        if(flll.size()>max){
            max=flll.size();
            /*      for(int i=0;i<l.size();i++){                                                                                                                                                                                                                                              
                System.out.print(""+l.get(i)+" ");                                                                                                                                                                                                                                            
            }                                                                                                                                                                                                                                                                                 
            System.out.println("");*/
        }
        return 0;
    }
    public void getmax(int x){
        max=x;
    }
    public int getmax(){
        return max;
    }
}