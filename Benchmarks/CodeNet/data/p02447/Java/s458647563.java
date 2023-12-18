import java.util.Scanner;
public class Main{
    public static boolean compare(Data a, Data b){
        if(a.x == b.x){
            if(a.y < b.y)
                return false;
            else
                return true;
        }
        else if(a.x > b.x)
            return true;
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Data data[] = new Data[n];
        for(int i = 0 ; i < n ; i++){
            long x = sc.nextLong();
            long y = sc.nextLong();
            data[i] = new Data(x,y);
        }
        for(int i = 0 ; i < n-1 ; i++){
            for(int j = n-1 ; j > i ; j--){
                if(compare(data[j-1],data[j])){
                    Data tmp = new Data(data[j-1].x,data[j-1].y);
                    data[j-1].x = data[j].x;
                    data[j-1].y = data[j].y;
                    data[j].x = tmp.x;
                    data[j].y = tmp.y;
                }
            }
        }
        for(int i = 0 ; i < n ; i++){
            System.out.println(data[i].x + " " + data[i].y);
        }
    }
}
class Data{
    long x;
    long y;
    Data(long x, long y){
        this.x = x;
        this.y = y;
    }
}
