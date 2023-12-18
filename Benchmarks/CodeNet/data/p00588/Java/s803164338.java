import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static final int UPPER=1;
    static final int MIDDLE=2;
    static final int NEXTBOOKS_UPPER_AND_LOWER=11;
    static final int NEXTBOOKS_UPPER=12;
    static final int NEXTBOOKS_LOWER=13;
    static final int NEXTBOOKS_NONE=14;
    static char[] upperBooks;
    static char[] lowerBooks;


    public static void main(String[] args){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int testCaseNum = Integer.parseInt(br.readLine());

            for(int i = 0;i<testCaseNum;i++){
                int n = Integer.parseInt(br.readLine());

                String books=br.readLine();

                upperBooks = new char[2*n];
                lowerBooks = new char[2*n];
                for(int j =0; j<upperBooks.length;j++){
                    upperBooks[j]=books.charAt(j);
                }

                for(int j =0; j<lowerBooks.length;j++){
                    lowerBooks[j]=books.charAt(j+(2*n));
                }

                System.out.println(calculateCost(0,n,UPPER));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    static boolean areBooksInUpperShelf(int num){
        return upperBooks[num*2]=='Y'||upperBooks[num*2-1]=='Y';
    }
    static boolean areBooksInLowerShelf(int num){
        return lowerBooks[num*2]=='Y'||lowerBooks[num*2-1]=='Y';
    }

    static int whereNextBooks(int num,int maxNum){
        if(num==maxNum){
            if(lowerBooks[num*2-1]=='Y'&&upperBooks[num*2-1]=='Y'){
                return NEXTBOOKS_UPPER_AND_LOWER;
            }else if(upperBooks[num*2-1]=='Y'){
                return NEXTBOOKS_UPPER;
            }else if(lowerBooks[num*2-1]=='Y'){
                return NEXTBOOKS_LOWER;
            }else{
                return NEXTBOOKS_NONE;
            }
        }else{
            if(areBooksInLowerShelf(num)&&areBooksInUpperShelf(num)){
                return NEXTBOOKS_UPPER_AND_LOWER;
            }else if(areBooksInUpperShelf(num)){
                return NEXTBOOKS_UPPER;
            }else if(areBooksInLowerShelf(num)){
                return NEXTBOOKS_LOWER;
            }else{
                return whereNextBooks(num+1,maxNum);
            }
        }

    }

    static int calculateCost(int num,int maxNum,int position){
        if(num==0){
            //????????????????????????????????????????????????

            if(lowerBooks[num]=='Y'){
                position=MIDDLE;//???????£????????????´??????????????????????????????????????????????????????
                int cost = calculateCost(num+1,maxNum,position);
                return cost+3;
            }else if(upperBooks[num]=='Y'){

                //?¬??????¬????????¨???????£???????????£??????????????????????????????????
                int nextBooksState=whereNextBooks(num+1,maxNum);
                if(nextBooksState==NEXTBOOKS_LOWER){
                    position=MIDDLE;
                }else{
                    position=UPPER;
                }

                int cost = calculateCost(num+1,maxNum,position);
                return cost+2;
            }else{
                int cost = calculateCost(num+1,maxNum,position);
                return cost+1;
            }
        }else if(num==maxNum){
            if(position==UPPER){
                if(lowerBooks[num*2-1]=='Y'){
                    return 3;
                }else if(upperBooks[num*2-1]=='Y'){
                    return 1;
                }else{
                    return 0;
                }
            }else{
                if(lowerBooks[num*2-1]=='Y') {
                    return 2;
                }else{
                    return 1;
                }
            }
        }else{

            if(position == UPPER){
                if(areBooksInLowerShelf(num)){

                    position = MIDDLE;
                    int cost = calculateCost(num+1,maxNum,position);
                    return cost+3;

                }else if(areBooksInUpperShelf(num)){

                    int nextBooksState=whereNextBooks(num+1,maxNum);
                    if(nextBooksState==NEXTBOOKS_LOWER){
                        position=MIDDLE;
                    }else{
                        position=UPPER;
                    }


                    int cost = calculateCost(num+1,maxNum,position);
                    return cost+2;


                }else{
                    int cost =calculateCost(num+1,maxNum,position);
                    return cost+1;
                }
            }else{
                if(areBooksInUpperShelf(num)){


                    int nextBooksState=whereNextBooks(num+1,maxNum);
                    if(nextBooksState==NEXTBOOKS_LOWER){
                        position=MIDDLE;
                    }else{
                        position=UPPER;
                    }

                    if(areBooksInLowerShelf(num)){
                        int cost = calculateCost(num+1,maxNum,position);
                        return cost+3;
                    }else{
                        int cost = calculateCost(num+1,maxNum,position);
                        return cost+2;
                    }

                }else if(areBooksInLowerShelf(num)){

                    int cost = calculateCost(num+1,maxNum,position);
                    return cost+2;

                }else{
                    int cost = calculateCost(num+1,maxNum,position);
                    return cost+1;
                }
            }
        }



    }
}