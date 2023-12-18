private class Main {

Scnanner snNum = new Scnanner(System.in);
Scnanner snRead = new Scnanner(System.in);

int iSnNum = Integer.parseInt(snNum);

if (iSnNum < snRead.length()) {

    snRead = snRead.subString(0, iSnNum);
} else {
    snRead;
}

System.out.print(snRead);