import java.nio.file.FileSystemAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<String> words = new ArrayList<>();
        boolean failed = false;

        for (int i = 0; i < N; i++) {
            String currentWord = sc.next();
            
            if (i == 0) {
                words.add(currentWord);
            } else {
                String prevWord = words.get(words.size() - 1);
                if (prevWord.substring(prevWord.length() - 1, prevWord.length()).equals(currentWord.substring(0, 1))) {
                    boolean sameWordFlg = false;
                    for (String element : words) {
                        if (element != null && element.equals(currentWord)) {
                            sameWordFlg = true;
                            break;
                        }
                    }
                    if (!sameWordFlg) {
                        words.add(currentWord);
                    } else {
                        failed = true;
                    }
                }  else {
                    failed = true;
                }
            }
        }

        if (failed) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}