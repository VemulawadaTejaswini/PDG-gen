

import java.util.Scanner;



public class Main {   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Tower[] tower = new Tower[4];
        for(int i=0; i < tower.length; i++) tower[i] = new Tower();
        
        int n;
        n = sc.nextInt();
        
        for(int i=0; i < n; i++){
            //System.out.println(tower[0]);
            tower[sc.nextInt()-1].index(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        String result = "";
        for(int i=0; i < tower.length; i++){
            result += tower[i].print();
            if(i != tower.length -1) result += "####################\n";
        }
        //result = result.substring(0, result.length() - 2);
        
        System.out.print(result);
    }
}

class Tower{
    
    Floor[] floor = new Floor[3];
    
    Tower(){
        for(int i=0; i < floor.length; i++) floor[i] = new Floor();        
    }
    
    void index(int f ,int r ,int v){
        floor[f-1].addPeople(r, v);
    }
    
    String print(){
        String result = "";
        for(Floor a : floor){
            for(int b : a.room){
                result += " " + b;
            }
            result += "\n";
        }
        return result;
    }
}

class Floor{    
    int[] room = new int[10];
    
    Floor(){
        for(int i=0; i < room.length; i++) room[i] = 0;
    }
    
    void addPeople(int r ,int v){
        this.room[r-1] += v;
    }
}

       
