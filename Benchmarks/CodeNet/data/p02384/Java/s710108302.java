import java.util.Scanner;

public class Main {
    public static void main(String[] args){
class Dice {
    private int[] surface = new int[6];

    public void setNum(int index, int num){
        this.surface[index] = num;
    }

    public int getNum(int index){
        return this.surface[index];
    }

    public int indexOf(int num){
        for(int i = 0; i < this.surface.length; i++){
            if(this.surface[i] == num){
                return i;
            }
        }
        return -1;
    }

    public void move(String vector){
        int sub = 0;
        if(vector.equals("E")){
            sub = this.surface[0];
            this.surface[0] = this.surface[3];
            this.surface[3] = this.surface[5];
            this.surface[5] = this.surface[2];
            this.surface[2] = sub;

        }else if(vector.equals("W")){
            sub = this.surface[0];
            this.surface[0] = this.surface[2];
            this.surface[2] = this.surface[5];
            this.surface[5] = this.surface[3];
            this.surface[3] = sub;

        }else if(vector.equals("N")){
            sub = this.surface[0];
            this.surface[0] = this.surface[1];
            this.surface[1] = this.surface[5];
            this.surface[5] = this.surface[4];
            this.surface[4] = sub;
        }else if(vector.equals("S")){
            sub = this.surface[0];
            this.surface[0] = this.surface[4];
            this.surface[4] = this.surface[5];
            this.surface[5] = this.surface[1];
            this.surface[1] = sub;
        }
    }
}

        Scanner scanner = new Scanner(System.in);

        Dice dice = new Dice();
        for(int i = 0; i < 6; i++){
            dice.setNum(i, scanner.nextInt());
        }

        int times = scanner.nextInt();
        for(int i = 0; i < times; i++){
            int x = dice.indexOf( scanner.nextInt() );
            int y = dice.indexOf( scanner.nextInt() );


            System.out.println(dice.getNum(leftSurface(x, y)));
        }

        scanner.close();
    }

    private static int leftSurface(int x, int y){

        int index = 0;

        switch (x){
            case 0:
                switch (y){
                    case 1:
                        index = 2;
                        break;
                    case 2:
                        index = 4;
                        break;
                    case 3:
                        index = 1;
                        break;
                    case 4:
                        index = 3;
                        break;
                }
                break;
            case 1:
                switch (y){
                    case 0:
                        index = 3;
                        break;
                    case 2:
                        index = 0;
                        break;
                    case 3:
                        index = 5;
                        break;
                    case 5:
                        index = 2;
                        break;
                }
                break;
            case 2:
                switch (y){
                    case 0:
                        index = 1;
                        break;
                    case 1:
                        index = 5;
                        break;
                    case 4:
                        index = 0;
                        break;
                    case 5:
                        index = 4;
                        break;
                }
                break;
            case 3:
                switch (y){
                    case 0:
                        index = 4;
                        break;
                    case 1:
                        index = 0;
                        break;
                    case 4:
                        index = 5;
                        break;
                    case 5:
                        index = 1;
                        break;
                }
                break;
            case 4:
                switch (y){
                    case 0:
                        index = 2;
                        break;
                    case 2:
                        index = 5;
                        break;
                    case 3:
                        index = 0;
                        break;
                    case 5:
                        index = 3;
                        break;
                }
                break;
            case 5:
                switch (y){
                    case 1:
                        index = 3;
                        break;
                    case 2:
                        index = 1;
                        break;
                    case 3:
                        index = 4;
                        break;
                    case 4:
                        index = 2;
                        break;
                }
                break;
        }
        return index;
    }
}

