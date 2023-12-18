import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        short[][] st = new short[50][3];
        short counter=0;
        short mid, last, add;
        while(true){
            mid = scanner.nextShort();
            last = scanner.nextShort();
            add = scanner.nextShort();
            if(mid == -1&&last == -1&&add == -1)break;
            if(mid != -1)st[counter][0] = mid;
            else st[counter][0] = 0;
            if(last != -1)st[counter][1] = last;
            else st[counter][1] = 0;
            st[counter][2] = add;
            counter++;
        }
        int sum;
        for(int i = 0; i < counter; i++){
            sum = st[i][0]+st[i][1];
            if(sum >= 80)System.out.println("A");
            else if(sum >= 65)System.out.println("B");
            else if(sum >= 50)System.out.println("C");
            else if(sum >= 30){
                if(st[i][2] >= 50)System.out.println("C");
                else System.out.println("D");
            }
            else System.out.println("F");
        }
    }
}

