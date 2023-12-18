while True:
    try:
        string = raw_input()
    except EOFError:
        break
    for i in range(10):
        translated = string.replace("X", str(i))
        left,right = translated.split("=")
        right = int(right)
        first,second = map(int,left.split("+"))
        if first + second == right:
            print i
            break
    else:
        print "NA"