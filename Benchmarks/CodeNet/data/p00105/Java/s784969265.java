import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Index> list = new ArrayList<>();
        while (sc.hasNext()) {
            String word = sc.next();
            int number = sc.nextInt();
            if (list.isEmpty()) {
                list.add(new Index(word, number));
            }else {
                boolean notMatch=true;
                for(Index i:list) {
                    if(i.word.equals(word)) {
                        i.pages.add(number);
                        notMatch=false;
                        break;
                    }
                }
                if(notMatch) {
                    list.add(new Index(word, number)); 
                }
            }
        }
        list.stream().sorted(Comparator.comparing(Index::getWord)).forEach(Index::print);
    }
}

class Index {
    String word;
    Set<Integer> pages = new TreeSet<>();

    Index(String word, int page) {
        this.word = word;
        this.pages.add(page);
    }
    String getWord() {
        return word;
    }
    void print() {
        System.out.println(word);
        System.out.println(pages.stream().map(Object::toString).collect(Collectors.joining(" ")));
    }
}
