import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int h=s.nextInt();
        int w=s.nextInt();
        int m=s.nextInt();
        HashMap<Integer,Integer> row=new HashMap<>();
        HashMap<Integer,Integer> col=new HashMap<>();
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();

        int maxRow=-1;
        int maxfreq=Integer.MIN_VALUE;

        for(int i=0;i<m;i++){
            int x=s.nextInt();
            int y=s.nextInt();
            
            if(row.containsKey(x)){
                int freq=row.get(x)+1;
                row.put(x,freq);
                if(freq>maxfreq){
                    maxfreq=freq;
                    maxRow=x;
                }
            }
            else{
                int freq=1;
                row.put(x,freq);
                if(freq>maxfreq){
                    maxfreq=freq;
                    maxRow=x;
                }
            }

            if(col.containsKey(y)){
                col.put(y,col.get(y)+1);
            }
            else{
                col.put(y,1);
            }

            if(map.containsKey(x)){
                map.get(x).add(y);
            }
            else{
                ArrayList<Integer> list=new ArrayList<>();
                list.add(y);
                map.put(x,list);
            }


        }

        
        //System.out.println(maxRow+" "+maxfreq);
        for(HashMap.Entry<Integer,Integer> entry:row.entrySet()){
            int newRow=entry.getKey();
            int freq=entry.getValue();
            if(freq==maxfreq && map.get(newRow).size()<map.get(maxRow).size()){
                maxRow=newRow;
            }
        }


        int ans=maxfreq;
        ArrayList<Integer> d=map.get(maxRow);
        for(int val:d){
            col.put(val,col.get(val)-1);
        }

        int maxColfreq=0;
        for(HashMap.Entry<Integer,Integer> entry:col.entrySet()){
            int freq=entry.getValue();
            maxColfreq=Math.max(maxColfreq,freq);
        }

        ans+=maxColfreq;
        //System.out.println(maxColfreq);
        System.out.print(ans);

        
    }
}