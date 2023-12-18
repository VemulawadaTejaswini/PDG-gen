long n = in.nextLong();

StringBuilder answer = new StringBuilder();
while (n > 0) {
    n--;
    answer.append((char) ('a' + n % 26));
    n /= 26;
}

out.println(answer.reverse());