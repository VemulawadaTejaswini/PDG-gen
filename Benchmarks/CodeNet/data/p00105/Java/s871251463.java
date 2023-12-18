import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Word[] words = new Word[100];
                int n = 0;
                while(sc.hasNext()){
                        String word = sc.next();
                        int page = sc.nextInt();
                        int idx = widx(words, word);
                        if(idx == n){ 
                                words[idx] = new Word(word, page);
                                n++;
                        }else{
                                words[idx].add(page);
                        }   
                }   
                sc.close();
                Word[] _words = new Word[n];
                System.arraycopy(words, 0, _words, 0, n); 
                Arrays.sort(_words, new WCompare());
                for(int i = 0 ; i < n ; i++){
                        System.out.println(_words[i].getWord());
                        _words[i].printPages();
                }   
        }   
        static int widx(Word[] list, String word){
                for(int i = 0 ; i < list.length ; i++){
                        if(list[i] == null || list[i].getWord().equals(word)){
                                return i;
                        }   
                }   
                return -1; 
        }   
}
class Word{
        String word;
        int[] pages;
        int npage;
        Word(String word, int page){
                this.word = word;
                pages = new int[100];
                npage = 0;
                this.add(page);
        }   
        void add(int page){
                pages[npage] = page;
                npage++;
        }   
        void printPages(){
                int[] tmp = new int[npage];
                System.arraycopy(pages, 0, tmp, 0, npage);
                Arrays.sort(tmp);
                for(int i = 0 ; i < npage-1 ; i++){
                        System.out.print(tmp[i] + " ");
                }   
                System.out.println(tmp[npage-1]);
        }   
        String getWord(){
                return word;
        }   
}
class WCompare implements Comparator{
        public int compare(Object o1, Object o2){
                Word w1 = (Word)o1;
                Word w2 = (Word)o2;
                return w1.getWord().compareTo(w2.getWord());
        }   
}