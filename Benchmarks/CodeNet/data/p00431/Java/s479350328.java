import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main (String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        while(true){
            Ring.ringList = new HashMap<Integer,Ring>(); 
            int n = Integer.parseInt(line);
            if(n==0){
                break;
            }
            
            for(int i=0;i<n;i++){
                String[] lines = br.readLine().split(" ");
                Ring a = Ring.getRing(Integer.parseInt(lines[0]));
                Ring b = Ring.getRing(Integer.parseInt(lines[1]));
                a.addNext(b);
                b.addNext(a);
            }
            
            int ans = 0;
            for(int key:Ring.getSeachRing()){
                ans = Math.max(ans,calc(Ring.ringList.get(key)));
            }
            
            System.out.println(ans);
            line = br.readLine();
        }
    }
    
    private static int calc(Ring start){
        int max = 0;
        Route route = new Route();
        route.use(start);

        Stack<Route> stack = new Stack<Route>();
        stack.push(route);
        while(!stack.isEmpty()){
            route = stack.pop();
            max = Math.max(max,route.cnt);
            ArrayList<Ring> next = route.lastLing.getNext();
            for(Ring ring:next){
                if(route.isUsable(ring)){
                    Route n_route = route.clone();
                    n_route.use(ring);
                    stack.push(n_route);
                }
            }
        }
        return max;
    }
    
    private static class Route{
        int cnt = 0;
        HashMap<Integer,Boolean> used = new HashMap<Integer,Boolean>();
        public Ring lastLing;
        public boolean isUsable(Ring ring){
            return !used.containsKey(ring.idx);
        }
        public void use(Ring ring){
            used.put(ring.idx,true);
            lastLing = ring;
            cnt++;
        }
        public Route clone(){
            Route route = new Route();
            route.cnt = this.cnt;
            route.lastLing = this.lastLing;
            for(int idx:this.used.keySet()){
                route.used.put(idx,true);
            }
            return route;
        }
    }
    
    
    private static class Ring{
        static HashMap<Integer,Ring> ringList = new HashMap<Integer,Ring>();
        public int idx;
        public ArrayList<Ring> next = new ArrayList<Ring>();
        public Ring(int idx){
            this.idx = idx;
        }
        public void addNext(Ring n){
            next.add(n);
        }
        public ArrayList<Ring> getNext(){
            return next;
        }
        public static Ring getRing(int idx){
            Ring ret;
            if(ringList.containsKey(idx)){
                ret = ringList.get(idx);
            }else{
                ret = new Ring(idx);
                ringList.put(idx,ret);
            }
            return ret;
        }
        
        public static ArrayList<Ring> getSeachRing(){
            ArrayList<Ring> ret = new ArrayList<Ring>();
            for(Ring ring:ringList){
                if(ring.next.size()<=2){
                    ret.add(ring);
                }
            }
            return ret;
        }
    }
}