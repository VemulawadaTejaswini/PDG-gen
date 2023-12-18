import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Floor[] floors = {new Floor(),new Floor(),new Floor(),new Floor()};
        int n = sc.nextInt();
        for(int i = 0;i < n;++i) floors[sc.nextInt() - 1].add(sc.nextInt() - 1,sc.nextInt() - 1,sc.nextInt());
        System.out.print(floors[0]);
        for(int i = 1;i < 4;++i){
            System.out.println("####################");
            System.out.print(floors[i]);
        }
    }

}

class Floor{

    private int[][] room = new int[10][3];

    public void add(int f,int r,int a){
        room[r][f] = a;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < 3;++i){
            for(int j = 0;j < 10;++j) sb.append(' ').append(room[j][i]);
            sb.append("\n");
        }
        return sb.toString();
    }

}