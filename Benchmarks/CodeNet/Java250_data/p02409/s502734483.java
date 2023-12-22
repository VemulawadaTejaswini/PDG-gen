import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Building B[]=new Building[4];
        for(int i=0;i<4;i++)B[i]=new Building();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            B[sc.nextInt()-1].updateResidents(sc.nextInt()-1,sc.nextInt()-1,sc.nextInt());
        }
        for(int i=0;i<4;i++){
            if(i!=0)System.out.println("####################");
            B[i].output();
        }
    }
}

class Building{
//    private int residents[][];
    private int floor=3;
    private int room=10;
    private int residents[][]=new int[floor][room];
    void Buidling(){
//        this.residents=new int[this.floor][this.room];
        for(int i=0;i<this.floor;i++){
            for(int j=0;j<this.room;j++){
                this.residents[i][j]=0;
            }
        }
    }
    public void updateResidents(int f,int r,int v){
        this.residents[f][r]+=v;
    }
    public void output(){
        for(int i=0;i<this.floor;i++){
            for(int j=0;j<this.room;j++){
                System.out.printf(" %d",this.residents[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
