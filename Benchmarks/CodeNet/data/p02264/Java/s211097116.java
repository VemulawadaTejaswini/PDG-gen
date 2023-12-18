import java.util.*;
 
class process {
 
    private String name;
    private int time;
     
    public process(String name,int time){
        this.name = name;
        this.time = time;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
 
    public void setTime(int time) {
        this.time = time;
    }
 
    public int getTime() {
        return time;
    }
}
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int q = sc.nextInt();
 
        ArrayList<process> ar = new ArrayList<process>();
        ArrayList<process> result = new ArrayList<process>();
         
        for (int i = 0; i < n; i++){
            ar.add(new process(sc.next(),Integer.parseInt(sc.next())));
        }
         
        int LapsedTime = 0,i = 0;
        process p;
         
        while(true){
            if(i < n){
                if((p = ar.get(i)).getTime() - q <= 0){
                    LapsedTime += p.getTime();
                    result.add(new process(p.getName(),LapsedTime));
                    ar.remove(i);
                    n--;
                } else {
                    LapsedTime += q;
                    p.setTime(p.getTime() - q);
                    i++;
                }
            } else {
                i = 0;
            }
            if (n == 0){
                break;
            }
        }
        for(process r:result) {
            System.out.println(r.getName() + " " + String.valueOf(r.getTime()));
        }
    }
}