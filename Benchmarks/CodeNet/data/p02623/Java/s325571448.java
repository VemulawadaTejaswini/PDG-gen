import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // 机A, Bそれぞれに積まれた本の数、制限時間を変数に格納する
        int bookCntA = console.nextInt();
        int bookCntB = console.nextInt();
        long limitMin = console.nextLong();
        console.nextLine();

        // 机Aに積まれている本の数を配列に格納する
        List<Long> aBooks = new ArrayList<Long>(bookCntA);
        for (int i = 0; i < bookCntA; i++) {
            aBooks.add(console.nextLong());
        }
        console.nextLine();

        // 机Bに積まれている本の数を配列に格納する
        List<Long> bBooks = new ArrayList<>(bookCntB);
        for (int i = 0; i < bookCntB; i++) {
            bBooks.add(console.nextLong());
        }

        // 机Aに積まれている本をすべて読むことを想定する
        int booksReadAOnly = 0;
        long limitMinTempA = limitMin;
        for (int i = 0; i < bookCntA; i++){
            long bookMin = aBooks.get(i);
            if(limitMinTempA - bookMin >= 0){
                limitMinTempA -= bookMin;
                booksReadAOnly++;
            } else {
                break;
            }
        }

        // 机Bに積まれている本をすべて読むことを想定する
        int booksReadBOnly = 0;
        long limitMinTempB = limitMin;
        for (int i = 0; i < bookCntB; i++){
            long bookMin = bBooks.get(i);
            if(limitMinTempB - bookMin >= 0){
                limitMinTempB -= bookMin;
                booksReadBOnly++;
            } else {
                break;
            }
        }

//        // 読むことが不可能な本を机から取り除く
//        for(int i = booksReadAOnly - 1; i < bookCntA; i++){
//            aBooks.remove(i);
//        }
//        for(int i = booksReadBOnly - 1; i < bookCntB; i++){
//            bBooks.remove(i);
//        }

        // 全パターンで検証する（readA = 読む机Aの本の数）
        List<Integer> list = new ArrayList<>();
        list.add(0);
        for(int readA = 1; readA <= booksReadAOnly; readA++){
            long limitMinTemp = limitMin;
            int bookCnt = 0;
            for(int i = 0; i < readA; i++){
                limitMinTemp -= aBooks.get(i);
                bookCnt++;
            }
            for(int j = 0; j < booksReadBOnly; j++){
                long bBookMin = bBooks.get(j);
                if(limitMinTemp >= bBookMin){
                    limitMinTemp -= bBookMin;
                    bookCnt++;
                }else{
                    break;
                }
            }
            list.add(bookCnt);
        }

        Collections.sort(list);
        Collections.reverse(list);

        System.out.println(list.get(0));
    }
}
